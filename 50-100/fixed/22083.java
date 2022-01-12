@java.lang.Override
public void filter(java.util.List<event.Event> list) {
    java.util.List<event.Event> decoratedList = decoratedFilterWork(list);
    for (event.Event entry : decoratedList) {
        try {
            if (entry.containsKeyword("title", myKeyword)) {
                myFilteredList.add(entry);
            }
        } catch (exception.TivooEventKeywordNotFound e) {
            myFilteredList.add(entry);
        }
    }
}