public void init() {
    if ((model) == null) {
        try {
            fieldImage = new org.newdawn.slick.Image(this.getImage());
        } catch (org.newdawn.slick.SlickException e) {
            e.printStackTrace();
        }
    }else {
        model.drawAll();
    }
}