@java.lang.Override
public void run() {
    li.grains.ParseSharePref parseSharePref = new li.grains.ParseSharePref(getString(R.string.share_pref_svm_param), getApplicationContext());
    double C = parseSharePref.getDouble("C");
    double gamma = parseSharePref.getDouble("gamma");
    my_svm = new li.grains.ml.My_SVM(C, gamma);
    is_svm_has_been_intialized = true;
    if ((is_got_train_features) == false)
        loadTrainFeatures();
    
    my_svm.train(train_x, train_y);
    progress.dismiss();
}