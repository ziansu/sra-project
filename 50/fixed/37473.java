@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case 0 :
            com.cusnews.app.activities.TopicListActivity.showInstance(this);
            break;
        case 1 :
            com.cusnews.app.activities.CustomizedTopicsActivity.showInstance(this);
            break;
    }
}