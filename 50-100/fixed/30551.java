@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.button_back :
            finish();
            break;
        case R.id.button_menu :
            popupMenu.show();
            break;
        case R.id.button_send :
            com.akitektuo.ticket.util.Constant.messageGenerator.addMessage(editMessage.getText().toString(), true);
            break;
    }
}