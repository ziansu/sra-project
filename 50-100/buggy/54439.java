@java.lang.Override
public void showBucket() {
    if (this.isViewAttached()) {
        if ((this.model) != null) {
            if (!(this.model.isEmpty())) {
                this.view.showBucket(this.model.toDisplayedList());
            }else {
                this.view.showBucketEmpty();
            }
        }else {
            this.view.showError();
        }
    }
}