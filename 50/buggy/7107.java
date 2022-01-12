@javax.annotation.Nullable
@java.lang.Override
public java.lang.Void apply(@javax.annotation.Nullable
net.bither.bitherj.db.imp.base.ICursor c) {
    net.bither.bitherj.db.imp.AbstractTxProvider.applyCursor(c, txItem);
    txExists[0] = true;
    return null;
}