@java.lang.Override
protected void init() {
    super.init();
    this.wordIndexList = new java.util.ArrayList<>();
    java.lang.String text = "";
    for (java.lang.String str : ((com.jfsiot.touchselect.touchselecttest.activity.MainActivity) (getActivity())).getTextSourse(1)) {
        text += str;
        wordIndexList.add(text.length());
    }
    free();
}