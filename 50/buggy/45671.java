public boolean canConvertTo(buildcraft.api.mj.EnumMjPower type) {
    return (type == (this)) || (to.contains(type));
}