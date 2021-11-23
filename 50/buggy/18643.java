@java.lang.Override
public boolean isUseless() {
    return ((getPosition()) != null) && (getBoolean(((james.monochrome.utils.MapUtils.getTileId(getPosition())) + (KEY_USELESS)), false));
}