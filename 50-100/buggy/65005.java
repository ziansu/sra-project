@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.String Input = s.toString();
    if (((Input.length()) > 0) && (!(Input.equals(mCheckItem.getMemo())))) {
        mCheckItem.setMemo(Input);
        excuteUpdateUI();
    }
}