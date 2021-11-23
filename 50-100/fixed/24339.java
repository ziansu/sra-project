public static void calculatePackages() {
    for (data.Order order : main.PackageCalculator.orders) {
        for (main.Link link : order.links) {
            data.Warehouse warehouse = link.warehouse;
            data.ProductType product = link.product;
            helperClasses.Position position = order.position;
            data.Parcel packet = new data.Parcel(product, warehouse.position, position);
            Simulation.packages.add(packet);
        }
    }
}