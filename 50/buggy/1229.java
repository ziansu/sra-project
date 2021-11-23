@java.lang.Override
public android.support.v4.content.Loader<com.expidev.gcmapp.model.Assignment> onCreateLoader(final int id, @android.support.annotation.Nullable
final android.os.Bundle args) {
    switch (id) {
        case com.expidev.gcmapp.MeasurementDetailsActivity.LOADER_CURRENT_ASSIGNMENT :
            return new com.expidev.gcmapp.support.v4.content.CurrentAssignmentLoader(this);
        default :
            return null;
    }
}