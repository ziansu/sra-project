@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    java.util.UUID modelId = ((java.util.UUID) (getArguments().getSerializable(com.example.jiahang.skateapp.SkateFragment.ARG_MODEL_ID)));
    model = com.example.jiahang.skateapp.ModelGroup.get(getActivity()).getModel(modelId);
}