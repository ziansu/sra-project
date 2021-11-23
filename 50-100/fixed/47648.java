private int readAmountFromTitle(java.lang.String title) {
    java.lang.String amount = title.replace((((((ChatColor.GREEN.toString()) + (ChatColor.BOLD.toString())) + (FMessage.TRADE_OFFER_AMOUNT.getMessage())) + ": ") + (ChatColor.DARK_AQUA.toString())), new java.lang.String());
    amount = amount.split(" ")[0];
    return io.github.dre2n.commons.util.NumberUtil.parseInt(amount);
}