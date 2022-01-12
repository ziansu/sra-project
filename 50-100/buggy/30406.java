private void setupDependencies() {
    depend(com.mastfrog.netty.http.client.StateType.Closed, com.mastfrog.netty.http.client.StateType.HeadersReceived, com.mastfrog.netty.http.client.StateType.ContentReceived, com.mastfrog.netty.http.client.StateType.FullContentReceived);
    depend(com.mastfrog.netty.http.client.StateType.ContentReceived, com.mastfrog.netty.http.client.StateType.HeadersReceived);
    depend(com.mastfrog.netty.http.client.StateType.FullContentReceived, com.mastfrog.netty.http.client.StateType.HeadersReceived, com.mastfrog.netty.http.client.StateType.ContentReceived);
    depend(com.mastfrog.netty.http.client.StateType.Finished, com.mastfrog.netty.http.client.StateType.HeadersReceived, com.mastfrog.netty.http.client.StateType.ContentReceived, com.mastfrog.netty.http.client.StateType.FullContentReceived, com.mastfrog.netty.http.client.StateType.Closed);
    depend(com.mastfrog.netty.http.client.StateType.Cancelled, com.mastfrog.netty.http.client.StateType.values());
    depend(com.mastfrog.netty.http.client.StateType.Error, com.mastfrog.netty.http.client.StateType.values());
    depend(com.mastfrog.netty.http.client.StateType.FullContentReceived, com.mastfrog.netty.http.client.StateType.HeadersReceived, com.mastfrog.netty.http.client.StateType.ContentReceived);
}