private void checkResult() {
    boolean checked = (Constant.FAILED.equals(cn.alpha.intell.factory.check.utils.Result.get(Constant.HEAD_LIGHT_ORIGIN))) ? true : false;
    mCheckOrigin.setChecked(checked);
    checked = (Constant.FAILED.equals(cn.alpha.intell.factory.check.utils.Result.get(Constant.HEAD_LIGHT_GREEN))) ? true : false;
    mCheckRed.setChecked(checked);
    checked = (Constant.FAILED.equals(cn.alpha.intell.factory.check.utils.Result.get(Constant.HEAD_LIGHT_RED))) ? true : false;
    mCheckGreen.setChecked(checked);
}