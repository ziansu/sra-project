@java.lang.Override
public java.lang.String toString() {
    return ((((((((("Proposal [height=" + (height)) + ", view=") + (view)) + ", block=") + (org.semux.crypto.Hex.encode(block.getHash()).substring(0, 16))) + ", # txs = ") + (block.getTransactions().size())) + ", proof=") + (proof)) + "]";
}