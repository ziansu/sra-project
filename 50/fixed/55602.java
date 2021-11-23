@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((_question) == null)
        return ;
    
    for (com.gradians.prepwell.dom.Card c : _question.getCards())
        c.detach();
    
}