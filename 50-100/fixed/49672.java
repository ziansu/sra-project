@java.lang.Override
public void valueChange(com.vaadin.data.Property.ValueChangeEvent event) {
    if (cmbBoxSort.getValue().equals("Név")) {
        messageList.removeAllComponents();
        for (hu.bugbusters.corpus.core.bean.Inbox mail : sortedListByName) {
            messageList.addComponent(new hu.bugbusters.corpus.core.vaadin.view.common.email.emailsubviews.EmailTextView(mail.getMessage(), mail.getSeen()));
        }
    }else {
        messageList.removeAllComponents();
        for (hu.bugbusters.corpus.core.bean.Inbox mail : sortedListByDate) {
            messageList.addComponent(new hu.bugbusters.corpus.core.vaadin.view.common.email.emailsubviews.EmailTextView(mail.getMessage(), mail.getSeen()));
        }
    }
}