@java.lang.Override
public boolean isPageComplete() {
    java.io.File file = getFile();
    if (!((((file.isDirectory()) && ((getSupplierCSD()) != null)) && ((getSupplierMSD()) != null)) && ((getSupplierWSD()) != null))) {
        return false;
    }else {
        return super.isPageComplete();
    }
}