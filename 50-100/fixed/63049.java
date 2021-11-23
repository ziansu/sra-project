public void addTag(java.lang.CharSequence charSequence) {
    if (((countOfSubString(getText().toString(), com.github.dotkebi.taginput.TagInputer.SHARP)) >= (maxCountOfTags)) && ((maxCountOfTags) > 0)) {
        return ;
    }
    blockSoftKey = true;
    if (!(android.text.TextUtils.isEmpty(getLastTag().replaceAll(com.github.dotkebi.taginput.TagInputer.SHARP, "")))) {
        append(" #");
    }
    append(charSequence);
    blockSoftKey = false;
}