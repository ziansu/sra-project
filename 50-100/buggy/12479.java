public void housesNotIncluded(java.util.ArrayList<org.w3c.dom.Element> houseElements) {
    if (!(houseElements.isEmpty())) {
        for (int i = 0; i < (houseElements.size()); i++) {
            if ((houseElements.get(i).getAttribute(model.ViewHandler.houseIDTag)) != null) {
                houseElements.get(i).setAttribute(model.ViewHandler.inView, "false");
            }
        }
    }else {
    }
}