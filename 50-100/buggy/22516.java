public void notifyModelChanged(java.lang.Object model) {
    for (int i = 0, len = mModels.size(); i < len; i++) {
        java.lang.Object obj = mModels.get(i);
        if (com.smilehacker.lego.LegoAdapter.legoFactory.getModelIndex(obj).equals(com.smilehacker.lego.LegoAdapter.legoFactory.getModelIndex(model))) {
            notifyItemChanged(i);
            break;
        }
    }
}