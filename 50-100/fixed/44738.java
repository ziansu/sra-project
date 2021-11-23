public void changeStaitment(int localSteps) {
    if (localSteps == (maxSteps)) {
        if (((index) + 1) == (ParamHolder.steps.size())) {
            finishPicture();
        }else {
            changeupPicture();
            changeOrientation(ParamHolder.direction.get(index), ParamHolder.direction.get(((index) + 1)));
        }
    }
}