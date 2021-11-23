@java.lang.Override
public void onClick(android.view.View view) {
    if ((position) < (list.size())) {
        com.adm.dictionary.entity.QuestionBean bean = list.get(position);
        (position)++;
        modifyReciteRecord(userId, token, bean.getId(), "0");
    }else {
        showToast("本次复习结束，继续努力");
        finish();
    }
}