@android.annotation.SuppressLint(value = "SetTextI18n")
@java.lang.Override
public void onNext(@io.reactivex.annotations.NonNull
com.thanhtuan.posnet.model.StatusProduct statusProduct) {
    if ((statusProduct.getData()) != null) {
        product = statusProduct.getData().get(0);
        listKMAll = product.getListItemkm();
        adapter = new com.thanhtuan.posnet.ui.reorder.thongtinsanpham.KhuyenMaiAdapter(getActivity(), listKMAll, product);
        rcvKhuyenMai.setAdapter(adapter);
    }else {
        android.widget.Toast.makeText(getActivity(), "Sản phẩm không có", Toast.LENGTH_SHORT).show();
    }
}