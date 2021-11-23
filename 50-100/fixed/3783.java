public void addTag(java.lang.CharSequence charSequence) {
    if ((maxCountOfTags) < 0) {
        return ;
    }
    if ((countOfSubString(getText().toString(), com.github.dotkebi.taginput.TagInputer.SHARP)) >= (maxCountOfTags)) {
        return ;
    }
    blockSoftKey = true;
    if (!(android.text.TextUtils.isEmpty(getLastTag().replaceAll(com.github.dotkebi.taginput.TagInputer.SHARP, "")))) {
        append(" #");
    }
    append(charSequence);
    blockSoftKey = false;
}