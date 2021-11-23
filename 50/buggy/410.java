public static com.example.evoca.evocaforandroidlearning.fragments.LessonFragment newInstance(com.example.evoca.evocaforandroidlearning.Model.Child lesson) {
    com.example.evoca.evocaforandroidlearning.fragments.LessonFragment fragment = new com.example.evoca.evocaforandroidlearning.fragments.LessonFragment();
    com.example.evoca.evocaforandroidlearning.activity.ListActivity.lesson = lesson;
    com.example.evoca.evocaforandroidlearning.fragments.LessonFragment.lesson = lesson;
    android.os.Bundle args = new android.os.Bundle();
    return fragment;
}