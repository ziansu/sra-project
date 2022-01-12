private InseparableModule.RemoveInfo replaceInternal(int start, int end, java.lang.CharSequence tb, int tbstart, int tbend) {
    com.github.kubatatami.richedittext.modules.InseparableModule.RemoveInfo info = com.github.kubatatami.richedittext.modules.InseparableModule.getRemoveInfo(this, start, end);
    super.replace(info.start, info.end, tb, tbstart, tbend);
    return info;
}