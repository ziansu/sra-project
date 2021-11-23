@java.lang.Override
public void setSelectedItem(java.lang.Object o) {
    if (o instanceof java.lang.String) {
        if ((o.toString().trim().length()) > 0) {
            showNewCloudServiceForm();
        }
    }else {
        super.setSelectedItem(o);
        fillStorage(null);
    }
}