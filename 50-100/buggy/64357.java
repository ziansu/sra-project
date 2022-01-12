@java.lang.Override
public void onSuccess(com.simpleql.shared.datamodel.DateElementCounter[] result) {
    com.simpleql.shared.datamodel.DateResolution resolution = com.simpleql.shared.datamodel.DateResolution.Year;
    for (int i = 0; i < (result.length); i++) {
        model.insert(result[i], resolution);
    }
    java.lang.System.out.println("[INFO] Call to ServerStub successful: received Root level values");
}