@butterknife.OnClick(value = R.id.btn_to)
void onToClick() {
    if ((crtToHolder) != null) {
        crtToHolder.mBtnTo.setChecked(false);
    }
    crtToHolder = this;
    mBtnTo.setChecked(true);
    if (!(items.get(position).equals(crtLangPair.getTargetLang()))) {
        crtLangPair.setTargetLang(items.get(position));
        mListener.onLangChanged(crtLangPair);
    }
}