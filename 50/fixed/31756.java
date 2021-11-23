@java.lang.Override
public void saveIdentificationName(java.lang.CharSequence string) {
    mPresenter.saveIdentificationName(string.toString());
    mIdentificationTicketView.setIdentificationName(string.toString());
    mIdentificationTicketView.draw();
}