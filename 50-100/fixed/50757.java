void setSystemQuest(com.quadcoder.coinpet.model.SystemQuest item) {
    imgvIcon.setImageResource(R.drawable.system_quest);
    tvTitle.setText(item.content);
    tvPoint.setText(((item.point) + ""));
    switch (item.state) {
        case com.quadcoder.coinpet.model.Quest.DOING :
            btnState.setBackgroundResource(R.color.grey);
            btnState.setText(R.string.btn_doing);
            break;
        case com.quadcoder.coinpet.model.Quest.FINISHED :
            btnState.setBackgroundResource(R.color.purple);
            btnState.setText(R.string.btn_finished);
            break;
    }
}