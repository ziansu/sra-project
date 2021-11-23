@java.lang.Override
public retrofit.Call<java.lang.String> get(@retrofit.http.Body
ua.rainbow.development.retrofitsample.User user) {
    return userRepository.get(user);
}