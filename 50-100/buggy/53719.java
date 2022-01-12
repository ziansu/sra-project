@java.lang.Override
public int offerEnergy(int amount) {
    java.util.regex.Matcher m = matcher();
    int charge = java.lang.Integer.parseInt(m.group(1));
    int max = java.lang.Integer.parseInt(m.group(2));
    int toTransfer = java.lang.Math.min(amount, (max - charge));
    update((charge + amount), max);
    return toTransfer;
}