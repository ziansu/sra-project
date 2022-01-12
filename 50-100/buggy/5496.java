@java.lang.Override
public int getColorFlags(final magic.model.MagicPermanent permanent, final int flags) {
    int mask = 0;
    for (final magic.model.MagicColor element : color) {
        mask += element.getMask();
    }
    if (additionTo) {
        return flags | mask;
    }else {
        return mask;
    }
}