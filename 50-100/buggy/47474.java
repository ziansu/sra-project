@java.lang.Override
public void onError(com.firebase.client.FirebaseError firebaseError) {
    switch (firebaseError.getCode()) {
        case com.firebase.client.FirebaseError.DISCONNECTED :
            android.widget.Toast.makeText(com.grupoonce.chat.FirebaseManager.main, "Hubo un problema de conectividad", Toast.LENGTH_SHORT).show();
            break;
        case com.firebase.client.FirebaseError.OPERATION_FAILED :
            android.widget.Toast.makeText(com.grupoonce.chat.FirebaseManager.main, "Ocurrió un error en el servidor, intente más tarde", Toast.LENGTH_SHORT).show();
            break;
        default :
            android.widget.Toast.makeText(com.grupoonce.chat.FirebaseManager.main, ("Lo sentimos, intente mas tarde" + (firebaseError.getMessage())), Toast.LENGTH_SHORT).show();
            break;
    }
}