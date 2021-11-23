public void draw() {
    try {
        int[] surfArr = com.ail.crxmarkets.Utils.parseIntArray(textArea);
        surface = new com.ail.crxmarkets.model.Surface(surfArr);
        updateBarModel(false);
    } catch (com.ail.crxmarkets.exception.ApplicationException e) {
        com.ail.crxmarkets.jsf.FacesUtils.error(e.getMessage());
    }
}