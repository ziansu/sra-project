@java.lang.Override
public void parameters(final java.lang.String[] par, final com.thevoxelbox.voxelsniper.SnipeData v) {
    if ((par.length) != 0) {
        v.sendMessage(TextColors.RED, "This brush does not accept additional parameters.");
    }
}