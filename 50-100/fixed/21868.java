@android.support.annotation.Nullable
public static ru.evotor.framework.core.action.event.receipt.discount.ReceiptDiscountEventResult create(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    if (bundle == null) {
        return null;
    }
    java.math.BigDecimal discount = ru.evotor.framework.core.action.datamapper.BundleUtils.getMoney(bundle, ru.evotor.framework.core.action.event.receipt.discount.ReceiptDiscountEventResult.KEY_DISCOUNT);
    if (discount == null) {
        return null;
    }
    return new ru.evotor.framework.core.action.event.receipt.discount.ReceiptDiscountEventResult(discount, ru.evotor.framework.core.action.event.receipt.changes.position.SetExtra.from(bundle.getBundle(ru.evotor.framework.core.action.event.receipt.discount.ReceiptDiscountEventResult.KEY_RECEIPT_EXTRA)));
}