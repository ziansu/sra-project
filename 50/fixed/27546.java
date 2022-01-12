@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mPhotoPicker = blueprint.com.sage.shared.validators.PhotoPicker.newInstance(getActivity(), getParentFragment());
}