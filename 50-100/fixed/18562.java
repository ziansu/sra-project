public void run() {
    if ((isProductRemoved.get(pos)) == false) {
        view.setAlpha(1.0F);
        this.cancel();
    }
    view.setAlpha(((view.getAlpha()) - 0.02F));
    if ((view.getAlpha()) <= 0) {
        isProductRemoved.remove(pos);
        guiProducts.remove(pos);
        adapter.notifyItemRemoved(pos);
        this.cancel();
    }
}