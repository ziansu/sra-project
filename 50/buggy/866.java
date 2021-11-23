public void changeDataSet(java.util.ArrayList<com.bitbudai.fermat_cht_android_sub_app_chat_bitdubai.models.ChatMessage> data) {
    if (filterString.equals(""))
        this.chatMessages = data;
    else
        this.filteredData = data;
    
}