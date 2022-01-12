public ru.nekit.android.nowapp.model.vo.Event getEventById(int id) {
    ru.nekit.android.nowapp.model.vo.Event result = null;
    for (int i = 0; (i < (mEvents.size())) && (result == null); i++) {
        ru.nekit.android.nowapp.model.vo.Event event = mEvents.get(i);
        if ((event.id) == id) {
            result = event;
        }
    }
    return result;
}