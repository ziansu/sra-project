@java.lang.Override
public void run() {
    if (!(u.isEmpty())) {
        grpc.chat.ChatterClient.messString = client.getMessage(u.getName());
        if (!(grpc.chat.ChatterClient.messString.isEmpty())) {
            java.lang.System.out.print(grpc.chat.ChatterClient.messString);
        }
    }
}