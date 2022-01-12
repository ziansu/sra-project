private void finalAction(android.view.ViewGroup contentContainer) {
    switch (activityType) {
        case LOGIC_BLOCKS :
            android.widget.ImageView imageView = ((android.widget.ImageView) (contentContainer.getChildAt(4)));
            loadSimpleImage(imageView, LogicBlocksConstants.ZOWI_POINTER, zowiapp.zowi.marco.zowiapp.utils.ImagesHandler.UNUSED_INDEX, zowiapp.zowi.marco.zowiapp.utils.ImagesHandler.UNUSED_INDEX, zowiapp.zowi.marco.zowiapp.utils.ImagesHandler.UNUSED_INDEX, null);
            break;
    }
}