@java.lang.Override
public void onHiddenChanged(boolean hidden) {
    super.onHiddenChanged(hidden);
    if (hidden) {
        changeText();
        addPageToRequest();
        MainActivity.listOfTemplatePagesObj.get(indexInList).setDataObj(dataObj);
    }else {
        changeText();
        MainActivity.listOfTemplatePagesObj.get(indexInList).setDataObj(dataObj);
    }
}