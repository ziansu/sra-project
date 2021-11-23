private boolean unlinkSlipSign(org.bukkit.block.Sign sign) {
    com.spinalcraft.slipdisk.Slip slip = slipFromUsername(sign.getLine(1));
    for (int i = 0; i < (Slip.MAX_SLIPS); i++) {
        if ((slip.sign[i]) != null) {
            if (slip.sign[i].equals(sign.getLocation()))
                return unlinkSignWithUsername(sign.getLine(1), (i + 1));
            
        }
    }
    return true;
}