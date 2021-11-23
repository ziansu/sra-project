public static com.example.uriel.ordertracker.App.Services.Impl.ConnectionService newTask(android.content.Context context) {
    com.example.uriel.ordertracker.App.Services.Impl.ConnectionService.writeIPtoFile(Constants.BASE_URL, false);
    return new com.example.uriel.ordertracker.App.Services.Impl.ConnectionService(context);
}