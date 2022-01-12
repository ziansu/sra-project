public java.lang.String updatePrice(java.lang.String origin, java.lang.String destination, logic.Route.TransportType transportType, java.lang.String price) {
    double newPrice;
    if (price.matches("^(?:\\d+(?:\\.\\d{2})?)$")) {
        newPrice = java.lang.Double.parseDouble(price);
    }else {
        return "Price must be in the correct format.";
    }
    logic.Route route = new logic.Route(origin, destination, transportType, newPrice);
    boolean success = logic.RouteService.update(route);
    if (success) {
        return "Success";
    }else {
        return "Price failed to update";
    }
}