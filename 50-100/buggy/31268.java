@java.lang.Override
public void onClick(android.view.View v) {
    if ((position) < (list.size())) {
        com.adm.dictionary.entity.QuestionBean bean = list.get(position);
        modifyReciteRecord(userId, token, bean.getId(), "-1");
        (position)++;
    }else {
        showToast("本次复习结束，继续努力");
        finish();
    }
}