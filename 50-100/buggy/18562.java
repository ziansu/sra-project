public void run() {
    view.setAlpha(((view.getAlpha()) - 0.02F));
    if ((view.getAlpha()) <= 0) {
        isProductRemoved.remove(pos);
        guiProducts.remove(pos);
        adapter.notifyItemRemoved(pos);
        this.cancel();
    }
}