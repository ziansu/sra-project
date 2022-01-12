@retrofit.http.PUT(value = "/repos/{owner}/{name}/notifications")
retrofit.client.Response markAsReadRepo(@retrofit.http.Path(value = "owner")
java.lang.String owner, @retrofit.http.Path(value = "name")
java.lang.String repo);