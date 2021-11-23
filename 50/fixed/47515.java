@butterknife.OnClick(value = R.id.iv_flag_bomb)
void flagBomb() {
    mMarked = !(mMarked);
    mIvFlagBomb.setImageResource((mMarked ? R.mipmap.iv_switch_flag : R.mipmap.iv_switch_bomb));
}