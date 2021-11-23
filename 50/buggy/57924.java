private void selectElementOnStage(br.com.mvbos.jeg.element.ElementModel elementModel) {
    if (isControlDown) {
        multiSelect(elementModel);
    }else {
        singleSelection(elementModel);
    }
}