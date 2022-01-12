@java.lang.Override
public void call(rx.Subscriber<? super java.util.List<com.aphoh.courser.utils.Assignment>> subscriber) {
    java.util.List<com.aphoh.courser.utils.Assignment> result = new java.util.ArrayList<>();
    for (com.aphoh.courser.utils.Assignment assignment : assignments) {
        if ((assignment.getCourse().getId()) == courseId)
            result.add(assignment);
        
    }
    subscriber.onNext(result);
}